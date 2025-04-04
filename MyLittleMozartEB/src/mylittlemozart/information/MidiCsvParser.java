package mylittlemozart.information;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class MidiCsvParser {

	public static List<MidiEventData> ParseCsv(String path) {
		// TODO Auto-generated method stub
		
		List<MidiEventData> EventList = new ArrayList<MidiEventData>();
		try {
			File CSV = new File("C:/songs/mystery_song.csv");
			Scanner CSVReader = new Scanner(CSV);
			CSVReader.useDelimiter(Pattern.compile(","));
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
		return EventList;
	}

}
