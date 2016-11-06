package asdb.demo.spring.boot.angular;

public class KeyValue {

	private Long id;
	private String key;
	private String value;

	public KeyValue(Long id, String key, String value) {
		this.id = id;
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
