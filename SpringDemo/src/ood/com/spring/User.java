package ood.com.spring;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
private String name ;
private String adress ;
@Override
public String toString() {
	return "User [name=" + name + ", adress=" + adress + "]";
}
}
