package mylittlemozart.strategy;
/**
 * implementation of the lower pitch modifiaction
 */
public class LowerPitchStrategy implements PitchStrategy{

	@Override
	public int modifyPitch(int note) {
		return note - 2;
	}
}
