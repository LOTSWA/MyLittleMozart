package mylittlemozart.strategy;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * implementation of the trumpet instrument change based on the value 0
 */
public class TrumpetStrategy implements InstrumentStrategy{
	private static final int T = 56;
	
	/**
	 * applies the trumpet to the midi channel of 0
	 * @param track
	 * @param channel
	 */
	@Override
	public void applyInstrument(Track track, int channel)
	{

			ShortMessage toolChange = new ShortMessage();
			try {
				toolChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, T, 0);
			} catch (InvalidMidiDataException e) {
				// TODO Auto-generated catch block
				System.err.println("Error with the Trumpet setting" + e.getMessage());
				e.printStackTrace();
			}
			track.add(new MidiEvent(toolChange, 0));
	}
}
