package mylittlemozart.factory;
/**
 * abstract factory that creates instances of legato midi event factories
 */
public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract
{
	/**
	 * 
	 */
	@Override
	public MidiEventFactory createFactory() {
	return new LegatoMidiEventFactory();
	}
}