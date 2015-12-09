public class mainm {

	public static void main(String ar[]) throws LineUnavailableException, InterruptedException{
		System.out.println("hi i am pomarodro timer");
		while(true){
			Thread.sleep(15000);
			sound();
			JOptionPane.showMessageDialog(null,"break time :) :D");
			Thread.sleep(3000);
			sound();
			JOptionPane.showMessageDialog(null,"start studying -_-");
		}
	}
	static void sound() throws LineUnavailableException{
		
		byte[] buf = new byte[ 1 ];;
	    AudioFormat af = new AudioFormat( (float )44100, 8, 1, true, false );
	    SourceDataLine sdl = AudioSystem.getSourceDataLine( af );
	    sdl.open();
	    sdl.start();
	    for( int i = 0; i < 1000 * (float )44100 / 1000; i++ ) {
	        double angle = i / ( (float )44100 / 440 ) * 2.0 * Math.PI;
	        buf[ 0 ] = (byte )( Math.sin( angle ) * 100 );
	        sdl.write( buf, 0, 1 );
	    }
	    sdl.drain();
	    sdl.stop();
	}
}

