package edu.black.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Menu {
    public Menu(Users users,List<Authority> MainMenu){
        Set<Authority> authorities = new HashSet<>();
        for (Roles roles:users.getRoles()){
            for (Authority authority:roles.getAuthorities()){
                authorities.add(authority);
            }
        }
        if (MainMenu!=null) subMenus = new ArrayList<>();
        for (Authority authority:MainMenu){
            SubMenu sub = new SubMenu();
            sub.setAuthorityid(authority.getAuthorityid());
            sub.setAuthorityname(authority.getAuthorityname());
            subMenus.add(sub);
        }
        for (Authority authority:authorities){
            for (SubMenu subMenu:subMenus){
                if (subMenu.getAuthorityid() == authority.getAuthorityparentid()){
                    if (subMenu.getAuthorityList() ==null){
                        subMenu.setAuthorityList(new ArrayList<Authority>());
                    }
                    subMenu.getAuthorityList().add(authority);
                }
            }
        }
    }
    List<SubMenu> subMenus;

    public List<SubMenu> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<SubMenu> subMenus) {
        this.subMenus = subMenus;
    }

    public class SubMenu{
        private Integer authorityid;
        private String authorityname;
        private String authorityaction;
        private List<Authority> authorityList;

        public Integer getAuthorityid() {
            return authorityid;
        }

        public void setAuthorityid(Integer authorityid) {
            this.authorityid = authorityid;
        }

        public String getAuthorityname() {
            return authorityname;
        }

        public void setAuthorityname(String authorityname) {
            this.authorityname = authorityname;
        }

        public String getAuthorityaction() {
            return authorityaction;
        }

        public void setAuthorityaction(String authorityaction) {
            this.authorityaction = authorityaction;
        }

        public List<Authority> getAuthorityList() {
            return authorityList;
        }

        public void setAuthorityList(List<Authority> authorityList) {
            this.authorityList = authorityList;
        }
    }


}
