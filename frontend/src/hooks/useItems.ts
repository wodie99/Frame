import {useEffect, useState} from "react";
import {getAllItems} from "../service/api-service";
import {Item} from "../model/Item";

export default function useItems() {
    const [items, setItems] = useState<Item[]>([]);

    useEffect(()=>{
        getAllItems()
            .then(allItems => setItems(allItems))
            .catch(() => alert("Connection failed! Please retry later."))
    },[])

    return {items}
}
