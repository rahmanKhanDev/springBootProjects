package com.nt.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//vo class
public class ActorData {
private Integer aid;
private String aname;
private String addrs;
private Double remuneration;
private String active_SW ;// active, deactive 

}
