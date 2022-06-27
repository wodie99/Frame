import axios from "axios";
import {Item} from "../model/Item";

export const getAllItems: () => Promise<Item[]> = () => {
    return axios.get("/api/item")
        .then(response => response.data)
}
