package domain.Inbound.controller;

import common.ValidCheck;
import domain.Inbound.service.InboundSearchService;
import dto.InboundDto;

import java.util.List;

public class InboundSearchControllerImp implements InboundSearchController{
    private final InboundSearchService inboundSearchService;
    private final ValidCheck validCheck;

    public InboundSearchControllerImp(InboundSearchService inboundSearchServicem, ValidCheck validCheck){
        this.inboundSearchService = inboundSearchServicem;
        this.validCheck = validCheck;
    }



    @Override
    public void userSearchAll() {


    }

    @Override
    public void SearchAll() {
        List<InboundDto> inboundDtoList = inboundSearchService.SearchAll();

        if(inboundDtoList.isEmpty()){
            System.out.println("서치올테스트");
            return;
        }
        System.out.println("서치올");
        System.out.println("프린트타이틀");
        System.out.println("프린트라운드");

        for(InboundDto inboundDto : inboundDtoList){
            System.out.printf("입고번호: %s | 상품ID: %s | 고객ID: %s | 수량: %d | 상태: %d | 요청일: %s | 창고ID: %s\n",
                    inboundDto.getInbound_number(),inboundDto.getProd_id(), inboundDto.getClient_id(),inboundDto.getQuantity(),
                    inboundDto.getInbound_status(), inboundDto.getReq_inbound_day(),inboundDto.getWare_id());
        }
    }

    @Override
    public void SearchOne() {


    }


}