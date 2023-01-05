package com.hangnt169.it17203.B2_RequestMapping.controller;

import com.hangnt169.it17203.B2_RequestMapping.model.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Buoi2Controller {

    private List<SinhVien>sinhViens= new ArrayList<>();
    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model){

       if(sinhViens.isEmpty()){
           sinhViens.add(new SinhVien("hangnt169","Nguyen Thuy Hang",10));
           sinhViens.add(new SinhVien("phongtt35","Nguyen Thuy Hang1",13));
           sinhViens.add(new SinhVien("nguyenvv4","Nguyen Thuy Hang2",15));
           sinhViens.add(new SinhVien("tiennh21","Nguyen Thuy Hang3",16));
           sinhViens.add(new SinhVien("dungna29","Nguyen Thuy Hang4",9));
           sinhViens.add(new SinhVien("khanhpg","Nguyen Thuy Hang5",7));
       }
        model.addAttribute("sinhViens",sinhViens);
        return "buoi2";
    }

    @GetMapping("/detail-sinh-vien/{ma}")
    public String detailSinhVien(@PathVariable("ma") String ma, Model model){
        SinhVien sinhVien = new SinhVien();
        for(SinhVien sv : sinhViens){
            if(sv.getMa().equals(ma)){
                sinhVien = sv;
            }
        }
        model.addAttribute("sinhVien",sinhVien);
        return "detailSinhVien";
    }

    @GetMapping("/sinh-vien/search-sinh-vien")
    public String searchSinhVien(@ModelAttribute() String ten, Model model){
        List<SinhVien> list = new ArrayList<>();
        for(SinhVien sv : sinhViens){
            System.out.println(sv.getTen().contains(ten));
            if(sv.getTen().contains(ten)){
                list.add(sv);
            }
        }
        model.addAttribute("sinhViens",list);
        return "buoi2";
    }

    @GetMapping("/delete-sinh-vien/{ma}")
    public String deleteSinhVien(@PathVariable("ma") String ma,Model model){
        for(SinhVien sv : sinhViens){
            if(sv.getMa().equals(ma)){
                sinhViens.remove(sv);
                break;
            }
        }
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/view-update-sinh-vien/{ma}")
    public String viewUpdateSinhVien(@PathVariable("ma") String ma, Model model){
        SinhVien sinhVien = new SinhVien();
        for(SinhVien sv : sinhViens){
            if(sv.getMa().equals(ma)){
                sinhVien = sv;
            }
        }
        model.addAttribute("sinhVien",sinhVien);
        return "updateSinhVien";
    }

    @PostMapping("/view-update-sinh-vien/update-sinh-vien")
    public String updateSinhVien(@ModelAttribute() SinhVien sinhVien, Model model){
        int index=0;
        for(SinhVien sv : sinhViens){
            if(sv.getMa().equals(sinhVien.getMa())){
                sinhViens.set(index,sinhVien);
            }
            index++;
        }
        return "redirect:/sinh-vien/hien-thi";
    }
}
