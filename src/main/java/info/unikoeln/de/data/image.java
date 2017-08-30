
package info.unikoeln.de.data;

import java.text.SimpleDateFormat;

public class image {

	public String name;
	public int size;
	public String type;
	public SimpleDateFormat uploadTime;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SimpleDateFormat getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(SimpleDateFormat uploadTime) {
		this.uploadTime = uploadTime;
	}

}