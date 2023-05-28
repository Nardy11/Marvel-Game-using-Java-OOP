package model.effects;

import model.world.Champion;

public class Dodge extends Effect {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Dodge(int duration) {
		super("Dodge", duration, EffectType.BUFF);

	}

	@Override
	public void apply(Champion c) {
		c.setSpeed((int) (c.getSpeed() * 1.05));

	}

	@Override
	public void remove(Champion c) {
		c.setSpeed((int) (c.getSpeed() / 1.05));

	}

}
