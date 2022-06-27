import React from 'react';
import './App.css';
import {Route, Routes} from "react-router-dom";
import ItemsOverview from "./components/ItemsOverview";
import Logout from "./components/Logout";
import Header from "./components/Header";
import useItems from "./hooks/useItems";

function App() {
    const {items} = useItems();
    return (
        <div className="App">

            <Header/>
            <Routes>
                <Route path={"/"} element={<ItemsOverview items={items}/>}/>
                <Route path={"/userpage"} element={<ItemsOverview items={items}/>}/>
                <Route path={"/logout"} element={<Logout/>}/>
            </Routes>
        </div>
    );
}

export default App;
