import React from "react";
import '../../App.css'
import { slide as Menu } from "react-burger-menu";
import salad from './Assets/salad.jpg';
import dishe from './Assets/dishe.png';
import dessert from './Assets/dessert.png';
import drink from './Assets/drink.png';
import account from './Assets/account.png';
export default props => {
  return (
    // Pass on our props
    <Menu {...props}>
      <a className="menu-item"  href="/homeCollaborator"  >
        Home
      </a >

      <a className="menu-item" href="/starters" >
      Starters
      <img  src={salad} alt="salad" id="salad"/>
      </a>

      <a className="menu-item" href="/dishes">
        Dishes
        <img src={dishe} alt="dishe" id="dishe"/>
      </a>

      <a className="menu-item" href="/desserts">
        Desserts
        <img src={dessert} alt="dessert" id="dessert"/>
      </a>

      <a className="menu-item" href="/drinks">
        Drinks
        <img src={drink} alt="drink" id="drink"/>
      </a>

      <a className="menu-item" href="/account">
        Account
        <img src={account} alt="account" id="account"/>
      </a>

      <a className="menu-item" href="/disconect">
        Disconnect
      </a>
    </Menu>
  );
};
