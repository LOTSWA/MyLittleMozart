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
    	
    	
/*    	
if ((temp = bufferRead.readLine()) != null && temp.startsWith("Start")) {
    			
    		}
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<MidiEventData> midiList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                try {
                    MidiEventData midiData = lineToMidiEventData(values);
                    midiList.add(midiData);
                } catch (IllegalArgumentException e) {
                    System.out.println("Skipping line due to error: " + Arrays.toString(values));
                    e.printStackTrace();
                }
            }
            return midiList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    private static MidiEventData lineToMidiEventData(String[] values) {
        // Check if the number of columns is correct
        int lineLength = 6;
        if (values.length != lineLength) {
            throw new IllegalArgumentException("Expected 6 columns, but found " + values.length + ": " + Arrays.toString(values));
        }

        int[] intValues = new int[lineLength];
        for (int i = 0; i < lineLength; i++) {
            try {
                // Attempt to parse the value as an integer
                intValues[i] = Integer.parseInt(values[i]);
            } catch (NumberFormatException e) {
                // Handle non-integer values (like "on" or "off")
                if (values[i].toLowerCase().contains("off")) {
                    intValues[i] = 0;
                } else if (values[i].toLowerCase().contains("on")) {
                    intValues[i] = 1;
                } else {
                    throw new IllegalArgumentException("Unable to parse value: " + values[i]);
                }
            }
        }

        // Create and return the MidiEventData
        return new MidiEventData(intValues[0], intValues[4], intValues[3], intValues[2], intValues[5], intValues[1]);
    }
}*/