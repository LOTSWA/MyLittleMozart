package mylittlemozart.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
/**
 * factory for implementing the creation of Standard Midi events
 */
public class StandardMidiEventFactory implements MidiEventFactory
{
	/**
	 * this method creates a note on midi event
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
	ShortMessage message = new ShortMessage();
	message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
	return new MidiEvent(message, tick);
}
	/**
	 * this method creates a note off midi event
	 * @param tick
	 * @param note
	 * @param channel
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
	ShortMessage message = new ShortMessage();
	message.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
	return new MidiEvent(message, tick);
	}
}