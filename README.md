# bitmap-transformer

Josh Frazer, Lucy Gelderloos, Caelin Hargrave

## BitMap Transformer

Takes in a bitmap image and draws sunglasses on it.

### Command line options:

`./gradlew run --args 'input output tranform`

Available transforms:

`./gradlew run --args 'baldy-8bit.bmp output.bmp sunglasses-black'` draws black sunglasses
`./gradlew run --args 'baldy-8bit.bmp output.bmp sunglasses-white'` draws white sunglasses
`./gradlew run --args 'baldy-8bit.bmp output.bmp sunglasses-random'` draws sunglasses of a random not at all horrifying color
