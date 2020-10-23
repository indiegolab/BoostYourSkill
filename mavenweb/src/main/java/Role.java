//DTO(Data Transfer Object) = VO(Value Object)
// 계층간 데이터 교환을 위한 자바빈즈
// Model
public class Role {
	private Integer roleId;
	private String description;
	
	public Role() {}
	
	public Role(Integer roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId+ ", description=" + description+"]";
	}
}
