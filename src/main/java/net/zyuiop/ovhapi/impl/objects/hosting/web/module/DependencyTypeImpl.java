package net.zyuiop.ovhapi.impl.objects.hosting.web.module;

import net.zyuiop.ovhapi.api.objects.hosting.web.module.DependencyType;
/**
 * Dependency parameters. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
 */

public class DependencyTypeImpl implements DependencyType { 

	private java.lang.String password;
	private java.lang.String name;
	private java.lang.String user;
	private java.lang.String type;
	private java.lang.String server;
	private long port;
	private java.lang.String prefix;

	public DependencyTypeImpl() {
	}

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public DependencyTypeImpl password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DependencyTypeImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getUser() { 
		return this.user;
	} 

	public void setUser(java.lang.String user) { 
		this.user = user;
	} 

	public DependencyTypeImpl user(java.lang.String user) { 
		this.user = user;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public DependencyTypeImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getServer() { 
		return this.server;
	} 

	public void setServer(java.lang.String server) { 
		this.server = server;
	} 

	public DependencyTypeImpl server(java.lang.String server) { 
		this.server = server;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public DependencyTypeImpl port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getPrefix() { 
		return this.prefix;
	} 

	public void setPrefix(java.lang.String prefix) { 
		this.prefix = prefix;
	} 

	public DependencyTypeImpl prefix(java.lang.String prefix) { 
		this.prefix = prefix;
		return this;
	} 

}
