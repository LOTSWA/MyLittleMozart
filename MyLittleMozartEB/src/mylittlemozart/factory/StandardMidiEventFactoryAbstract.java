package mylittlemozart.factory;
/**
 * abstract factory that creates instances of Standard midi event factories
 */
public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract 
{
	/**
	 * creation of a factory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}
}