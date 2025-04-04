package mylittlemozart.factory;

public class LegatoMidiEventFactory implements MidiEventFactory
{
	public createNoteOn(int tick, int note, int veocity, int channel)
	{
		return (tick,"Note On",velocity,channel);
	}
	
	public createNoteOff(int tick, int note, int channel)
	{
		return (tick +80 ,"Note Off",channel)
	}	
	
}