package mylittlemozart.strategy;

public class HigherPitchStrategy implements PitchStrategy{
	
	@Override
	public int modifyPitch(int note) {
		return note + 2;
	}
}
