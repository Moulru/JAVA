import java.io.BufferedWriter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.io.FileWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

/*
 *		Melon 스타일 차트 크롤링 
 *		http://www.melon.com/chart/style/index.htm 사이트의 정보를
 *		맨위 3개의 스타일의 정보 중 검색하고싶은 스타일 이름을 GUI 검색창에 입력하면
 *		해당 스타일 차트의 데이터를 구해서 파일로 저장한다
 */

public class MelonMusic extends JFrame {
	CrawlingThread th;
	int width = 600;
	int height = 600;
	String projectPath = System.getProperty("user.dir");
	String path = projectPath + "\\lib\\melon_music_TOP100.csv";

	MelonMusic() {
		setTitle("MelonChartGood - 멜론 차트");

		// 화면 가운데 출력
		Dimension screen = new Dimension();
		screen = Toolkit.getDefaultToolkit().getScreenSize();

		int xPos = (screen.width / 2) - (this.width / 2);
		int yPos = (screen.height / 2) - (this.height / 2);
		setBounds(xPos, yPos, this.width, this.height);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container con = getContentPane();
		setLayout(null);
		con.setBackground(Color.WHITE);

		// 검색창 세팅
		JTextField textField = new JTextField("장르 입력");
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setBounds(10, 180, 200, 50);
		textField.setBackground(Color.WHITE);
		con.add(textField);
		textField.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			// 검색창 클릭 시, 검색값 빈공간으로 초기화
			public void mouseClicked(MouseEvent e) {
				if (textField.getText().equals("장르 입력")) {
					textField.setText("");
					return;
				}
			}
		});

		// 어쿠스틱 스타일 라벨
		JLabel jlabel1 = new JLabel();
		jlabel1.setBounds(400, 450, 100, 50);
		jlabel1.setText("어쿠스틱 스타일");
		jlabel1.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				jlabel1.setBackground(Color.blue);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("어쿠스틱 스타일");
			}
		});
		con.add(jlabel1);
		jlabel1.setFont(new Font("Default", Font.BOLD, 12));

		// 얼터너티브 팝 라벨
		JLabel jlabel2 = new JLabel();
		jlabel2.setBounds(240, 450, 100, 50);
		jlabel2.setText("얼터너티브 팝");
		jlabel2.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("얼터너티브 팝");
			}
		});
		con.add(jlabel2);
		jlabel2.setFont(new Font("Default", Font.BOLD, 12));

		// 올디스 라벨
		JLabel jlabel3 = new JLabel();
		jlabel3.setBounds(100, 450, 100, 50);
		jlabel3.setText("올디스");
		jlabel3.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("올디스");
			}
		});
		con.add(jlabel3);
		jlabel3.setFont(new Font("Default", Font.BOLD, 12));

		// 제목 라벨
		JLabel jlabel4 = new JLabel();
		jlabel4.setBounds(50, 40, 500, 150);
		jlabel4.setText("멜론 차트 순위 검색기");
		jlabel4.setVerticalTextPosition(Font.CENTER_BASELINE);
		jlabel4.setHorizontalAlignment(JTextField.CENTER);
		jlabel4.setBackground(Color.GREEN);
		jlabel4.setFont(new Font("Default", Font.BOLD, 45));
		con.add(jlabel4);

		// 검색 버튼
		JButton btn = new JButton("장르 검색");
		btn.setBounds(400, 180, 100, 50);
		con.add(btn);
		btn.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton b = (JButton) e.getSource();

				if (textField.getText().equals("올디스")) {
					// setter 입력 '3'
					th.setter(3);
				} else if (textField.getText().equals("얼터너티브 팝")) {
					// setter 입력 '2'
					th.setter(2);
				} else if (textField.getText().equals("어쿠스틱 스타일")) {
					// setter 입력 '1'
					th.setter(1);
				} else {
					JOptionPane.showMessageDialog(b, "다시입력하세요");
					return;
				}

				JOptionPane.showMessageDialog(b, "".format("\"%s\"에 저장됨", path));
				th.noti();
				textField.setText("장르 검색");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.MAGENTA);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.CYAN);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.YELLOW);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		con.add(btn);

		// 창 활성화
		setVisible(true);

		// 쓰레드 활성화
		th = new CrawlingThread();
		th.start();
	}

	synchronized public static void main(String[] args) {
		new MelonMusic();
	} // main() end
}

// 크롤링 전용 쓰레드 클래스
class CrawlingThread extends Thread {
	private int select = 1;

	void setter(int i) {
		this.select = i;
	}

	synchronized void noti() {
		notify();
	}

	@Override
	synchronized public void run() {

		// 쓰레드는 무한반복 시킴
		while (true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}

			String projectPath = System.getProperty("user.dir");
			String chromePath = projectPath + "\\lib\\chromedriver.exe";
			String csvPath = projectPath + "\\lib\\melon_music_TOP100.csv";

			ArrayList<songInfo> List = new ArrayList<>();
			System.setProperty("webdriver.chrome.driver", chromePath);
			WebDriver driver = new ChromeDriver();

			if (select == 1) {
				driver.get(
						"http://www.melon.com/chart/style/index.htm#params%5Bidx%5D=1&params%5BstartDay%5D=20180226&params%5BendDay%5D=20180304&params%5BisFirstDate%5D=false&params%5BisLastDate%5D=true");
			} else if (select == 2) {
				driver.get(
						"http://www.melon.com/chart/style/index.htm?styleCd=GN0902#params%5Bidx%5D=1&params%5BstartDay%5D=20180226&params%5BendDay%5D=20180304&params%5BisFirstDate%5D=false&params%5BisLastDate%5D=true");
			} else if (select == 3) {
				driver.get(
						"http://www.melon.com/chart/style/index.htm?styleCd=GN0903#params%5Bidx%5D=1&params%5BstartDay%5D=20180226&params%5BendDay%5D=20180304&params%5BisFirstDate%5D=false&params%5BisLastDate%5D=true");
			}

			// 페이지 넘기면서 소스가져옴
			for (int page = 1; page <= 2; page++) {
				if (page != 1) {
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("".format("movePage(%d)", page));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e2) {
					}

					Document doc = Jsoup.parse(driver.getPageSource());

					Elements musicbody = doc.select("div.service_list_song.type02.d_song_list tr");

					for (int i = 0; i < musicbody.size(); i++) {
						Element song = musicbody.get(i);

						String name = song.select("div.ellipsis.rank01 a").text().replace(",", " ");
						String singer = song.select("div.ellipsis.rank02 span a").text().replace(",", " ");
						List.add(new songInfo(name, singer));
					}
				}
			}

			driver.close();

			// 파일 쓰기
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(csvPath));
				writer.write("NAME,SINGER\n");
				for (int i = 0; i < List.size(); i++) {
					writer.write("".format("%s,%s", List.get(i).name, List.get(i).singer));
					writer.newLine();
				}
				writer.close();
			} catch (Exception e2) {
			}
		}
	}
}

// 배열 저장할 클래스
class songInfo {
	String name;
	String singer;

	songInfo(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
}