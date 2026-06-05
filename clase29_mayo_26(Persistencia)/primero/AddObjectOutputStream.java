package primero;
import java.io.*;
import java.io.ObjectOutputStream;

public class AddObjectOutputStream extends ObjectOutputStream {
	public AddObjectOutputStream(OutputStream out) throws IOException{
        super(out);
	}
	protected void writeStreamHeader() throws IOException{
	      this.reset();
	}

}
