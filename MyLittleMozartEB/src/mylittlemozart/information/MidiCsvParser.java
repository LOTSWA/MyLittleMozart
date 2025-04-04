package mylittlemozart.information;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MidiCsvParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File CSV = new File("mystery_song.csv");
			Scanner CSVReader = new Scanner(CSV);
			while (CSVReader.hasNextLine()) {
				String data = CSVReader.nextLine();
				System.out.println(data);
			}
			CSVReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("an error occurred.");
			e.printStackTrace();
		}
	}

}
