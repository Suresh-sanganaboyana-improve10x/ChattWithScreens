package com.example.chattwithscreens.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.chattwithscreens.R;

import java.util.ArrayList;

public class GroceryActivity extends AppCompatActivity {

    public ArrayList<Grocery> groceryList;
    public RecyclerView groceryRv;
    public GroceryAdapter groceryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        getSupportActionBar().hide();
        setupDataForGrocery();
        setupRecyclerViewForGroceries();
    }

    private void setupRecyclerViewForGroceries() {
        groceryRv = findViewById(R.id.grocery_rv);
        groceryRv.setLayoutManager(new GridLayoutManager(this, 3));
        groceryAdapter = new GroceryAdapter();
        groceryAdapter.setData(groceryList);
        groceryRv.setAdapter(groceryAdapter);
    }

    private void setupDataForGrocery() {
        groceryList = new ArrayList<>();

        Grocery one = new Grocery();
        one.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-fruits-3b26c10dc05d15fbe45ceb3d0eaa816d.png";
        one.title = "Fresh Fruits";
        groceryList.add(one);

        Grocery two = new Grocery();
        two.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-onions-and-tomatos-1986e0017a966f57a20fce08853c25ad.png";
        two.title = "Onions & Tomatoes";
        groceryList.add(two);

        Grocery three = new Grocery();
        three.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-vegetables-9799bef8ba92fd03c53f0546ae404a55.png";
        three.title = "Fresh Vegetables";
        groceryList.add(three);

        Grocery four = new Grocery();
        four.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-exotic-fruits-d5fb208beef0323598ebd4e0c676d2b8.png";
        four.title = "Exotic Fruits";
        groceryList.add(four);

        Grocery five = new Grocery();
        five.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mangoes-5dec36e3d054464908f125421f2748c2.png";
        five.title = "Mangoes";
        groceryList.add(five);

        Grocery six = new Grocery();
        six.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-dairy-91f031697f2e433799e567f021460f9b.png";
        six.title = "Dairy";
        groceryList.add(six);

        Grocery seven = new Grocery();
        seven.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-bread-and-buns-ea6fc0dcbc8cd860c88cc1310c64e8d6.png";
        seven.title = "Bread & Buns";
        groceryList.add(seven);

        Grocery eight = new Grocery();
        eight.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cereal-and-oats-4578a048785cef3231ce946e0385e320.png";
        eight.title = "Cereals & Oats";
        groceryList.add(eight);

        Grocery nine = new Grocery();
        nine.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-horlicks-25492b5096ad52bcd21607c6fc3f03d9.png";
        nine.title = "Health Drinks";
        groceryList.add(nine);

        Grocery ten = new Grocery();
        ten.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-ready-to-eat-9f44b2f69ef008732be5de955293bfe5.png";
        ten.title = "Ready-to-eat";
        groceryList.add(ten);

        Grocery eleven = new Grocery();
        eleven.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-biscuits-and-cookies-ee0423b9d3478a4c7499cf7f1d32e4bf.png";
        eleven.title = "Biscuits & cookies";
        groceryList.add(eleven);

        Grocery twelve = new Grocery();
        twelve.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chips-and-namkeen-e3d8b0e18b4b6721cc565d03922ca3d5.png";
        twelve.title = "Chips & Namkeen";
        groceryList.add(twelve);

        Grocery thirteen = new Grocery();
        thirteen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-tea-and-coffee-683381e7427398452e760dfb6c816e1e.png";
        thirteen.title = "Tea & Coffee";
        groceryList.add(thirteen);

        Grocery fourteen = new Grocery();
        fourteen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-softdrinks-and-juice-09a3e724b1b1851ffe9747d4c03eb3b7.png";
        fourteen.title = "Soft Drinks & Juice";
        groceryList.add(fourteen);

        Grocery fifteen = new Grocery();
        fifteen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-energy-and-sportsdrinks-8dc82b984a9a536206aa8685dce463b8.png";
        fifteen.title = "Energy & Soft Drinks";
        groceryList.add(fifteen);

        Grocery sixteen = new Grocery();
        sixteen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-atta-and-flours-b85c359a33d1a017df2ddc830dbb3172.png";
        sixteen.title = "Atta & Flours";
        groceryList.add(sixteen);

        Grocery seventeen = new Grocery();
        seventeen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-baking-essentials-5b3a70840b2f29a6bfd8f08bbc62c339.png";
        seventeen.title = "Backing Essentials";
        groceryList.add(seventeen);

        Grocery eighteen = new Grocery();
        eighteen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cooking-pastes-75b2e7ccc1255261d1a277d63209b1ae.png";
        eighteen.title = "Cooking Pastes";
        groceryList.add(eighteen);

        Grocery nineteen = new Grocery();
        nineteen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-masala-and-spices-985e3e74c25545edecc6e13b3f3728fb.png";
        nineteen.title = "Masala & Spices";
        groceryList.add(nineteen);

        Grocery twenty = new Grocery();
        twenty.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-canned-fruit-and-vegetables-c6adef7534b8faa7100c671daab54e2f.png";
        twenty.title = "Canned Fruits & Vegetables";
        groceryList.add(twenty);

        Grocery twentyOne = new Grocery();
        twentyOne.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chicken-8883976089fb7016f8b1e0f058fcdd8a.png";
        twentyOne.title = "Chicken";
        groceryList.add(twentyOne);

        Grocery twentyTwo = new Grocery();
        twentyTwo.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fish-and-seafood-b692e65b128c6dc49d42a4c39b8dac92.png";
        twentyTwo.title = "Fish & Seafood";
        groceryList.add(twentyTwo);

        Grocery twentyThree = new Grocery();
        twentyThree.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mutton-af19fffe878f5d0e057cc44865967cb5.png";
        twentyThree.title = "Mutton";
        groceryList.add(twentyThree);

        Grocery twentyFour = new Grocery();
        twentyFour.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-marinated-cuts-daf965857a0904ab3cc263e2e3c1f672.png";
        twentyFour.title = "Marinated Cuts";
        groceryList.add(twentyFour);

        Grocery twentyFive = new Grocery();
        twentyFive.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-eggs-e1f42bcafd6d5cd04084de21bad9c494.png";
        twentyFive.title = "Eggs";
        groceryList.add(twentyFive);
    }
}