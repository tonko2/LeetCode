package algorithm;

public class Problem832 {
    public int[][] flipAndInvertImage(int[][] image) {
        flip(image);
        invert(image);
        return image;
    }
    private void flip(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image.length/2; j++) {
                int tmp = image[i][j];
                image[i][j] = image[i][image.length - 1 - j];
                image[i][image.length - 1 - j] = tmp;
            }
        }
    }

    private void invert(int[][] image) {
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image.length; j++) {
                image[i][j] = 1 - image[i][j];
            }
        }
    }
}
