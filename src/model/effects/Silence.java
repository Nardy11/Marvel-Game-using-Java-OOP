package model.effects;

import model.world.Champion;

public class Silence extends Effect {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Silence( int duration) {
		super("Silence", duration, EffectType.DEBUFF);
		
	}

	@Override
	public void apply(Champion c) {
		c.setCurrentActionPoints(c.getCurrentActionPoints()+2);
		c.setMaxActionPointsPerTurn(c.getMaxActionPointsPerTurn()+2);

		
		
	}

	@Override
	public void remove(Champion c) {
		c.setCurrentActionPoints(c.getCurrentActionPoints()-2);
		c.setMaxActionPointsPerTurn(c.getMaxActionPointsPerTurn()-2);
		
		
	}

}
