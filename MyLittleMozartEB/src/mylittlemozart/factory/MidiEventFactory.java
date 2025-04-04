package mylittlemozart.factory;

public interface MidiEventFactory 

{
	MidiEventFactory createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEventFactory createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}

