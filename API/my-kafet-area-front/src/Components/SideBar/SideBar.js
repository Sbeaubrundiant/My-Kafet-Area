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
        Account Type :
        {/* Account type : {isACollaborator} {isBrigade} */}
      </a >

      <a className="menu-item" href="/starters" >
      User name :
      
      </a>

      

      <a className="menu-item" href="/faq">
        Faq 
      </a>

      <a className="menu-item" href="/about">
        About... 
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
