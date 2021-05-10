package inheritance2;

public class LogManager {

	public void log(int logType) {
		if(logType ==1) {
			System.out.println("Veritabanýna loglandý");
		} else if(logType ==2) {
			System.out.println("dosyaya loglandý");
		}else {
			System.out.println("email gönderildi");
		}
	}

}
//1-database
//2-file
//3-email