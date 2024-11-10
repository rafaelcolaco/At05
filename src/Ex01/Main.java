package Ex01;

public class Main {
    public static void main(String[] args) {
        SistemaDeSom som = new SistemaDeSom();
        SistemaDeVideo video = new SistemaDeVideo();
        
        HomeTheater homeTheater = new HomeTheater();
        homeTheater.setSom(som);
        homeTheater.setVideo(video);
        System.out.println(homeTheater.toString());
    }
}