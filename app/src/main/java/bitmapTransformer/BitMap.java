package bitmapTransformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {

    public final String imageLocation;
    public final BufferedImage img;

    public BitMap(String imageLocation) {
        this.imageLocation = imageLocation;
        this.img = loadImage(imageLocation);
    }

    public static BufferedImage loadImage(String imageLocation){
        String filePath = System.getProperty("user.dir") + "/src/" + imageLocation;
        // when using ./gradlew run, need to not include /app
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public void saveImage(String savePath){
        String filePath = System.getProperty("user.dir") + "/src/" + savePath;
        File newFile = new File(filePath);
        try {
            ImageIO.write(this.img, "bmp", newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drawRectangle(int startX, int startY, int endX, int endY, int color) {
        int width = this.img.getWidth();
        int height = this.img.getHeight();

        for(int x = startX; x < endX && x < width; x++){
            for(int y = startY; y < endY && y < height; y++){
                this.img.setRGB(x,y,color);
            }
        }
    }

    public void putOnSunglasses(int color, int startX, int startY) {
        drawRectangle(startX, startY, startX + 25, startY + 20, color);
        drawRectangle(startX + 35, startY, startX + 60, startY + 20, color);
        drawRectangle(startX + 20, startY + 5, startX + 40, startY + 10, color);
    }

}
