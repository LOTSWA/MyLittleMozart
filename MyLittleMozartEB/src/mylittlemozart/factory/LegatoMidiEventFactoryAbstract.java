package mylittlemozart.factory;
/**
 * abstract factory that creates instances of legato midi event factories
 */
public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract
{
	/**
	 * creation of a factory
	 */
	@Override
	public MidiEventFactory createFactory() {
	return new LegatoMidiEventFactory();
	}
}