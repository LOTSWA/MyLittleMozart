package mylittlemozart.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
/**
 * implementation of the acoustic grand piano instrument change based on the value 0
 */
public class AcousticGrandPianoStrategy implements InstrumentStrategy{
	private static final int AGP = 0;
	/**
	 * applies the grand piano to the midi channel of 0
	 * @param track
	 * @param channel
	 */
	@Override
	public void applyInstrument(Track track, int channel)
	{

			ShortMessage toolChange = new ShortMessage();
			try {
				toolChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, AGP, 0);
			} catch (InvalidMidiDataException e) {
				// TODO Auto-generated catch block
				System.err.println("Error with the Acoustic Grand Piano setting" + e.getMessage());
				e.printStackTrace();
			}
			track.add(new MidiEvent(toolChange, 0));
	}
}
