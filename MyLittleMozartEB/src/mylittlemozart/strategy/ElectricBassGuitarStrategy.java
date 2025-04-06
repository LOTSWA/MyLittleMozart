package mylittlemozart.strategy;

import javax.sound.midi.*;

/**
 * implementation of the electric bass guitar instrument change based on the value 0
 */
public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	private static final int EBG = 33;
	/**
	 * applies the electric bass guitar to the midi channel of 0
	 * @param track
	 * @param channel
	 */
	@Override
	public void applyInstrument(Track track, int channel)
	{

			ShortMessage toolChange = new ShortMessage();
			try {
				toolChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, EBG, 0);
			} catch (InvalidMidiDataException e) {
				// TODO Auto-generated catch block
				System.err.println("Error with electric bass guitar setting" + e.getMessage());
				e.printStackTrace();
			}
			track.add(new MidiEvent(toolChange, 0));
	}
}
