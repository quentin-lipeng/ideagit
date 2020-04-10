package Tesk08;

public class Server {
	private String name;
	private String path;
	private long port;
	private String version;
	
	
	public Server(String name,String path,long port,String version) {
		this.name = name;
		this.path = path;
		this.port = port;
		this.version = version;
	}
	
	public Server() {}
	@Override
	public String toString() {
		return "[name=" + name + ", path=" + path + ", port=[" + port + "], version=" + version + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public long getPort() {
		return port;
	}
	public void setPort(long port) {
		this.port = port;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
