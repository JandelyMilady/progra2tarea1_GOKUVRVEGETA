package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	/*private Texture texture;
	private Sprite sprite;*/
	private Texture texture_lalaa;
	private Sprite sprite_lalaa;
	private Texture texture_goku;	
	private Sprite sprite_goku;
	private Texture texture_vegeta;
	private Sprite sprite_vegeta;
	Stage stage;
	Image image;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		/*texture = new Texture(Gdx.files.internal("data/libgdx.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);*/
		texture_lalaa = new Texture(Gdx.files.internal("data/lalaa.png"));
		texture_goku = new Texture(Gdx.files.internal("data/goku.png"));
		texture_vegeta = new Texture(Gdx.files.internal("data/vegeta.png"));
		
		/*TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);*/
		

		sprite_lalaa = new Sprite(texture_lalaa,1024,1024); 
		sprite_lalaa.setPosition(-0.5f,-0.65f); 
		sprite_lalaa.setSize(1f,1f);
		
		sprite_goku = new Sprite(texture_goku,512,512); 
		sprite_goku.setPosition(0.1f,-0.2f); 
		sprite_goku.setSize(0.4f,0.4f);

		sprite_vegeta = new Sprite(texture_vegeta,1024,1024); 
		sprite_vegeta.setPosition(-0.3f,-0.8f); 
		sprite_vegeta.setSize(1f,1f);
		
		/*sprite = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);*/
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		/*texture.dispose();*/
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite_lalaa.draw(batch);
		sprite_goku.draw(batch);
		sprite_vegeta.draw(batch);
		/*sprite.draw(batch);*/
		batch.end();
		
		sprite_goku.setX(sprite_goku.getX()-0.001f);
		sprite_vegeta.setY(sprite_vegeta.getY()-0.002f);
		
		/*sprite_goku.setX(sprite_goku.getY()+0.5f);
		if (sprite_goku.getY()>500)
			sprite_goku.setY(-100);*/
	}

	@Override
	public void resize(int width, int heig1024ht) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
