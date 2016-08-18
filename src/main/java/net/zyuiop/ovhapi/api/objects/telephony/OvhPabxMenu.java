package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * IVR Menu
 */

public class OvhPabxMenu { 

	private long menuId;
	private java.lang.String name;
	private long invalidSound;
	private long greetSound;

	public OvhPabxMenu() {
	}

	public long getMenuId() { 
		return this.menuId;
	} 

	public void setMenuId(long menuId) { 
		this.menuId = menuId;
	} 

	public OvhPabxMenu menuId(long menuId) { 
		this.menuId = menuId;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OvhPabxMenu name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getInvalidSound() { 
		return this.invalidSound;
	} 

	public void setInvalidSound(long invalidSound) { 
		this.invalidSound = invalidSound;
	} 

	public OvhPabxMenu invalidSound(long invalidSound) { 
		this.invalidSound = invalidSound;
		return this;
	} 

	public long getGreetSound() { 
		return this.greetSound;
	} 

	public void setGreetSound(long greetSound) { 
		this.greetSound = greetSound;
	} 

	public OvhPabxMenu greetSound(long greetSound) { 
		this.greetSound = greetSound;
		return this;
	} 

}
