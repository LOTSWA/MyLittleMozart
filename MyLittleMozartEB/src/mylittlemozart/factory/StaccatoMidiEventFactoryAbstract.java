package mylittlemozart.factory;
/**
 * abstract factory that creates instances of Staccato midi event factories
 */
public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract
{
	/**
	 * creation of a factory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}
}