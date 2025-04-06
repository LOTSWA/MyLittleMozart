package mylittlemozart.information;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.ShortMessage;

public class MidiCsvParser {

    public static List<MidiEventData> parseCsv(String pathing) {
    	List<MidiEventData> midiEvents = new ArrayList<>();
    	try (BufferedReader bufferRead = new BufferedReader(new FileReader(pathing))) {
    		String temp;
    		
    	while ((temp = bufferRead.readLine()) != null) {
    		int noteOnOff;
    			String[] data = temp.split(",");
    				//checking all 6 fields
    			if (data.length == 6) {
    				int startEndTick = Integer.parseInt(data[0]);
    				String onOff = data[1].trim();
    				int channel = Integer.parseInt(data[2]);
    				int note = Integer.parseInt(data[3]);
    				int velocity = Integer.parseInt(data[4]);
    				int instrument = Integer.parseInt(data[5]);
    					
    				if(onOff.equals("Note_on_c")) {
    					noteOnOff = ShortMessage.NOTE_ON;
    				}
    				else {
    					noteOnOff = ShortMessage.NOTE_OFF;
    				}
    				MidiEventData event = new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff);
    				midiEvents.add(event);
    			}
    		}
    	}
    	catch(FileNotFoundException e) {
    		System.err.println("File can't be found" + pathing);
    	}
    	catch(Exception e) {
    		System.err.println("Error occured with reading the file" + e.getMessage());
    	}
        return midiEvents;
    }
}
    	