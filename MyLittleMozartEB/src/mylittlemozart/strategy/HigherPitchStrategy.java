package mylittlemozart.strategy;
/**
 * implementation of the higher pitch modifiaction
 */
public class HigherPitchStrategy implements PitchStrategy{
	
	@Override
	public int modifyPitch(int note) {
		return note + 2;
	}
}
