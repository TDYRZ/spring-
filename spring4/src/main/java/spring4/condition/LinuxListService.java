package spring4.condition;
/**
 * linux下创建的bean
 * @author yrz
 *
 */
public class LinuxListService implements ListService{

	public String showListCmd() {
		return "ls";
	}

}
