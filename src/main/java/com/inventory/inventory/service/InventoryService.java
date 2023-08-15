package com.inventory.inventory.service;

import com.inventory.inventory.model.ApiResponse;
import com.inventory.inventory.model.Items;
import com.inventory.inventory.repo.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
    @Autowired
    ItemsRepo itemsRepo;

    public ApiResponse fetchAllItems() {
        List<Items> itemsList = new ArrayList<>();
        Items items = new Items();

        items.setItemId(1L);
        items.setName("Bulb");
        items.setPrice(100d);
        items.setImage("https://th.bing.com/th/id/OIP.EDNrZPbPpxzKpADKfe6rugHaIs?pid=ImgDet&w=199&h=233&c=7&dpr=1.3");
        items.setDescription("A very good product, often purchased and used by customers to light up their homes, " +
                "and other" +
                "room, work spaces. Now get this lights at an affordable costs, hurry up, offer is limited.");
//        itemsRepo.save(items);

        itemsList.add(items);

        items = new Items();

        items.setItemId(2L);
        items.setName("Music System");
        items.setPrice(1000d);
        items.setImage("https://th.bing.com/th?id=OIP.IQwt3hPc7lRI4zPtlPvF9wHaFB&w=303&h=206&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription("Buy this home theater at very low price.Offer is limited, so hurry up.");
        itemsList.add(items);

        items = new Items();

        items.setItemId(3L);
        items.setName("Ps5");
        items.setPrice(50000d);
        items.setImage("https://th.bing.com/th?id=OIP.9o4Vawt-bPiChyRKPRRfWgHaFj&w=288&h=216&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription("PS5; Games Included:No; Maximize your play sessions with near instant load times for installed PS5 games; " +
                "Enjoy smooth and fluid high frame rate gameplay at up to 120fps for compatible games, with support for 120Hz");
        itemsList.add(items);

        items = new Items();

        items.setItemId(4L);
        items.setName("psp");
        items.setPrice(5000d);
        items.setImage("https://th.bing.com/th?id=OIP.haAnHMlXoytddnEOTS1qTAHaDc&w=350&h=162&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription("The PSP™ (PlayStation® Portable) system is the first truly integrated portable entertainment system designed " +
                "to handle multiple applications - music, video, photo, internet, and much more.");
        itemsList.add(items);

        items = new Items();

        items.setItemId(5L);
        items.setName("XBox");
        items.setPrice(50000d);
        items.setImage("https://th.bing.com/th?id=OIP.LrAHuN07SQowKtJfhusRRQHaJP&w=223&h=279&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription("Discover the fastest, most powerful Xbox ever with the Xbox Series X. Enjoy 4K gaming at up to 120 frames " +
                "per second on this next generation video game console. Skip to main content Microsoft");
        itemsList.add(items);

        items = new Items();

        items.setItemId(6L);
        items.setName("Pc");
        items.setPrice(30000d);
        items.setImage("https://th.bing.com/th?id=OIP.i6b4cHc0xKnP77_ZE3qpTgHaFY&w=293&h=213&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription("Choose from a wide range of desktops online to suit your lifestyle. Discover desktop computers from brands like " +
                "Lenovo, Dell, Apple, Asus, HP, and more that offer powerful operating systems to improve productivity. ");
        itemsList.add(items);

        items = new Items();

        items.setItemId(7L);
        items.setName("Laptops");
        items.setPrice(25000d);
        items.setImage("https://th.bing.com/th/id/OIP.sOdWXA8w_vNRtjpSjt6IdQHaFn?w=230&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
        items.setDescription("Choosing the best laptop online that satisfies your requirements as a user is very important. " +
                "The best laptop brands " +
                "including Dell Laptops, HP laptops, Lenovo laptops, Acer laptops, Apple MacBooks, Asus Laptops and more");
        itemsList.add(items);

        items = new Items();

        items.setItemId(8L);
        items.setName("Watch");
        items.setPrice(3000d);
        items.setImage("https://www.bing.com/th?id=OIP.lB9gHUxuwILFLx12jADU-AHaKY&w=150&h=210&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription("The Watch Store is about celebrating these timeless pieces' beauty and grandeur. We have every kind of watch " +
                "you can dream of, from digital watches, analog watches, and chronograph watches to sports watches, luxury watches, and premium watches. " +
                "Our brand also houses some of the most popular international watch brands. ");
        itemsList.add(items);

        items = new Items();

        items.setItemId(9L);
        items.setName("Men Footwear");
        items.setPrice(1000d);
        items.setImage("https://th.bing.com/th/id/OIP.YTSDZguMO2uBdRYJy9WZDQHaEy?w=263&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
        items.setDescription("Footwear, Accessories & More. Shop From the Comfort Of Your Home & Get Your Favourites Delivered Right To Your Doorstep.\n" +
                "\n" +
                "Fresh Collection · Premium Brands · 10 Lakhs Styles · 3000+ Brands.");
        itemsList.add(items);

        items = new Items();

        items.setItemId(10L);
        items.setName("Women Footwear");
        items.setPrice(1000d);
        items.setImage("https://th.bing.com/th/id/OIP.Y2c9u2oLEC6_u0FvmukUpwAAAA?w=210&h=186&c=7&r=0&o=5&dpr=1.3&pid=1.7");
        items.setDescription(" Footwear. Dial up the style on your strides with AJIO’s terrific troupe of women’s footwear. " +
                "Popular brands like VANS, STEVE MADDEN and MFT Couture bring to our shelves a vast fleet featuring flat");
        itemsList.add(items);

        items = new Items();

        items.setItemId(11L);
        items.setName("Ps5 games");
        items.setPrice(2000d);
        items.setImage("https://th.bing.com/th?id=OIP.Tojqh2pJ1peBLuP6o1azGwHaGL&w=273&h=228&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
        items.setDescription(" God of War Ragnarok. Picking up several years after the events of its …\n" +
                "Marvel's Spider-Man: Miles Morales. A sequel that’s most akin to Uncharted: …\n" +
                "Horizon Forbidden West. If you're on the hunt for an open-world, narrative …\n" +
                "Sackboy: A Big Adventure. This is a game that’s perfect for families ");
        itemsList.add(items);

        items = new Items();

        items.setItemId(12L);
        items.setName("XBox games");
        items.setPrice(4000d);
        items.setImage("https://th.bing.com/th/id/OIP.56rIfAZ3_Mb1b3QMEBZ9fwHaEK?w=313&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
        items.setDescription("Experience the new generation of games and entertainment with Xbox. Explore consoles, new and " +
                "old Xbox games and accessories to start or add to your collection.");
        itemsList.add(items);

//        itemsRepo.saveAll(itemsList);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(itemsList);

        return apiResponse;
    }
}
