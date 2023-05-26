	package pack4_serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class J implements Externalizable{
	int i;
	double j;
	String k;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(i);
		out.writeDouble(j);
		out.writeUTF(k);
		out.writeInt(400000000);
		out.writeUTF("test");
		System.out.println("..........done writing ");
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		i = in.readInt();
		j = in.readDouble();
		k = in.readUTF();
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
		System.out.println(".......done reading " + this);
	}
}
