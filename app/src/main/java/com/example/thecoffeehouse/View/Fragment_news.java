package com.example.thecoffeehouse.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.Adapter.SectionAdapter;
import com.example.thecoffeehouse.Model.News;
import com.example.thecoffeehouse.Model.Section;
import com.example.thecoffeehouse.News_Reward;
import com.example.thecoffeehouse.R;

import java.util.ArrayList;

public class Fragment_news extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.listofsections);
        ArrayList<Section> sections = new ArrayList<>();
        Section section = new Section();
        section.setHeaderTitle("Ưu đãi đặc biệt");
        ArrayList<News> news = new ArrayList<>();
        news.add(new News(R.drawable.uudai1,"Giảm 50%, thèm thì gọi nhé nhà mang tới liền","Hoà vào không khí siêu sale cuối năm mời team mình nghỉ tay gọi món yêu thích, Nhà giảm 50% khi nhập mã MERRY, để lên tinh thần thăn thoắt cùng","Chi tiết"));
        news.add(new News(R.drawable.uudai2,"Nhà mời ca phê đậm đà chỉ 20K","Tuần mới chỉ thật tươi tỉnh khi có một tách cà phê kề bên biết vậy nên nhà mời liền bạn có hoá đơn từ 50K mua cà phê Việt Nam giá chỉ 12k","Chi tiết"));
        news.add(new News(R.drawable.uudai3,"Nhà mời 20%, PICKUP nha","Chờ gì mà chưa trải nghiệm tính năng PICKUP của Nhà với ưu đãi giảm 20% cho đơn hàng chỉ từ 2 món, khi nhập mã PICKUPDI nào","Chi tiết"));
        section.setListContent(news);
        sections.add(section);
        SectionAdapter sectionAdapter = new SectionAdapter(sections,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sectionAdapter);

        Section section1 = new Section();
        section1.setHeaderTitle("Cập nhập từ nhà");
        ArrayList<News> news1 = new ArrayList<>();
        news1.add(new News(R.drawable.nha1,"Câu chuyện về Sơ ri The coffee house","Chẳng phải tự nhiên The Coffee House chọn Sơ ri Gò Công - Tiền Giang chứ không phải Sơ ri ở những vùng đất khác để tạo nên bộ đôi Trà Sơ ri Thanh long & Yakult Sơ ri Thanh long trứ danh. Vậy lý do tại sao?","Chi tiết"));
        news1.add(new News(R.drawable.nha2,"Chương trình khách hàng thân thiết, bạn có thêm 3 tháng đổi nhận ưu đãi","Chương trình khách hàng thân thiết - The Coffee House Rewards cập nhật thêm nhiều ưu đãi hấp dẫn, đa tiện ích: giải trí, mua sắm, ăn uống,... Đặc biệt, kéo dài thời gian đổi BEAN thêm 3 tháng. Kiểm tra mục Rewards và tận hưởng ưu đãi đặc quyền ngay hôm nay.","Chi tiết"));
        news1.add(new News(R.drawable.nha3,"Đêm hội phá cỗ, Nhà kể chuyện rằm","Trung Thu mỗi năm mỗi khác và không còn vẹn tròn như xưa, nhất là với một năm nhiều biến động và âu lo này thì ý nghĩa đêm trăng lại càng trở nên khó tìm hơn. Nhưng không phải vì thế mà yêu thương không được lan toả, những cảm xúc háo hức và vui tươi một lần nữa được trở lại tại Nhà với “ĐÊM HỘI PHÁ CỖ\".","Chi tiết"));
        section1.setListContent(news1);
        sections.add(section1);
        SectionAdapter sectionAdapter1 = new SectionAdapter(sections,getContext());
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setAdapter(sectionAdapter1);

        Section section2 = new Section();
        section2.setHeaderTitle("#CoffeeLover");
        ArrayList<News> news2 = new ArrayList<>();
        news2.add(new News(R.drawable.coffee1,"Gói tiết kiệm dành cho người yêu trà với coffee","Nhà hiểu rằng, một ngày sẽ chẳng tròn vị nếu thiếu vắng mùi vị thân quen. Không ít bạn chia sẻ với Nhà về những hôm quên thưởng thức món yêu thích chỉ vì bận rộn hay đơn giản là không rủ được người order cùng. Đặc biệt trong những ngày hạn chế ra ngoài như thế này, thèm lắm một ly cà phê hay một hương vị trà thân quen nhưng lại \"ngại\" di chuyển.\n","Chi tiết"));
        news2.add(new News(R.drawable.coffee2,"Khám phá cuộc phiêu lưu bên trong hộp bánh trung thu","Chương trình khách hàng thân thiết - The Coffee House Rewards cập nhật thêm nhiều ưu đãi hấp dẫn, đa tiện ích: giải trí, mua sắm, ăn uống,... Đặc biệt, kéo dài thời gian đổi BEAN thêm 3 tháng. Kiểm tra mục Rewards và tận hưởng ưu đãi đặc quyền ngay hôm nay.","Chi tiết"));
        news2.add(new News(R.drawable.coffee3,"Đón mùa trăng sung túc cùng THE COFFEE HOUSE","Trung Thu mỗi năm mỗi khác và không còn vẹn tròn như xưa, nhất là với một năm nhiều biến động và âu lo này thì ý nghĩa đêm trăng lại càng trở nên khó tìm hơn. Nhưng không phải vì thế mà yêu thương không được lan toả, những cảm xúc háo hức và vui tươi một lần nữa được trở lại tại Nhà với “ĐÊM HỘI PHÁ CỖ\".","Chi tiết"));
        section2.setListContent(news2);
        sections.add(section2);
        SectionAdapter sectionAdapter2 = new SectionAdapter(sections,getContext());
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager2);
        recyclerView.setAdapter(sectionAdapter2);


        ImageView accumulatePoints = v.findViewById(R.id.img_news_accumulatePoints);
        accumulatePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),News_accumulate_points.class);
                startActivity(intent);
            }
        });

        ImageView coupons = v.findViewById(R.id.img_news_coupon);
        coupons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),News_coupons.class);
                startActivity(intent);
            }
        });

        ImageView rewards = v.findViewById(R.id.img_news_rewards);
        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), News_Reward.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
