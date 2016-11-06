package asdb.demo.spring.boot.angular;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

@Entity
public class KeyValueElement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Transient
	private Long primKey;
	private String key;
	private String value;

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

	public Long getPrimKey() {
		return id;
	}

	

}
