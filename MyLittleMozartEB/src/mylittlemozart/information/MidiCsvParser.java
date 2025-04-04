package mylittlemozart.information;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class MidiCsvParser {

	
	public static void main(String[] args) {
	//public static List<MidiEventData> parseCsv(String path) {
		// TODO Auto-generated method stub
		
		List<MidiEventData> EventList = new ArrayList<MidiEventData>();
		try {
			File CSV = new File("C:/songs/mystery_song.csv");
			Scanner CSVReader = new Scanner(CSV);
			CSVReader.useDelimiter(Pattern.compile(","));
			while (CSVReader.hasNextLine()) {
				
				String data = CSVReader.nextLine();
				EventList.add(processLine(data));
				System.out.println(data);
			}
			CSVReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("an error occurred.");
			e.printStackTrace();
		}
	//	return EventList;
	}
	
	public static MidiEventData processLine(String data) {
		String[] tokens = data.split(",");
		 MidiEventData item = new MidiEventData(tokens[0], tokens[1]);
		return null;
	}

}
