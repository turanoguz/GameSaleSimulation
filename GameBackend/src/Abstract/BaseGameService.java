package Abstract;

import Entity.Game;

public abstract class BaseGameService implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun kaydedildi : "+game.getName() );
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi :"+game.getName());
		
	}
	

	
	



}
