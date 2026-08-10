package com.example.structure.Facade;

public class HomeTheaterFacade {
    private final SmartLights lights = new SmartLights();
    private final Projector projector = new Projector();
    private final SoundSystem sound = new SoundSystem();

    public void watchMovies(String movie){
        System.out.println("Setting up movie: "+ movie);
        lights.dim();
        projector.turnOn();
        sound.setSurroundSound();
    }
}
