package me.BadBones69.CrazyEnchantments;

import java.util.List;

import me.BadBones69.CrazyEnchantments.API.CrazyEnchantments;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.BurnShield;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Drunk;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Enlightened;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Fortify;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Freeze;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Hulk;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Molten;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Ninja;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Nursery;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.OverLoad;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.PainGiver;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Savior;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.SelfDestruct;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.SmokeBomb;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Valor;
import me.BadBones69.CrazyEnchantments.Enchantments.Armor.Voodoo;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.Berserk;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.Blessed;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.Cursed;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.Decapitation;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.Dizzy;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.FeedMe;
import me.BadBones69.CrazyEnchantments.Enchantments.Axes.Rekt;
import me.BadBones69.CrazyEnchantments.Enchantments.Boots.AntiGravity;
import me.BadBones69.CrazyEnchantments.Enchantments.Boots.Gears;
import me.BadBones69.CrazyEnchantments.Enchantments.Boots.Springs;
import me.BadBones69.CrazyEnchantments.Enchantments.Bow.Boom;
import me.BadBones69.CrazyEnchantments.Enchantments.Bow.IceFreeze;
import me.BadBones69.CrazyEnchantments.Enchantments.Bow.Lightning;
import me.BadBones69.CrazyEnchantments.Enchantments.Bow.Piercing;
import me.BadBones69.CrazyEnchantments.Enchantments.Bow.Venom;
import me.BadBones69.CrazyEnchantments.Enchantments.Helmets.Glowing;
import me.BadBones69.CrazyEnchantments.Enchantments.Helmets.Mermaid;
import me.BadBones69.CrazyEnchantments.Enchantments.PickAxes.AutoSmelt;
import me.BadBones69.CrazyEnchantments.Enchantments.PickAxes.Experience;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Blindness;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Confusion;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Disarmer;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.DoubleDamage;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Execute;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.FastTurn;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Headless;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Inquisitive;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Insomnia;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.LifeSteal;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.LightWeight;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Nutrition;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Obliterate;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Paralyze;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Rage;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.SkillSwipe;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.SlowMo;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Snare;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Trap;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Vampire;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Viper;
import me.BadBones69.CrazyEnchantments.Enchantments.Swords.Wither;
import me.BadBones69.CrazyEnchantments.Enchantments.Tools.Haste;
import me.BadBones69.CrazyEnchantments.Enchantments.Tools.Oxygenate;
import me.BadBones69.CrazyEnchantments.Enchantments.Tools.Telepathy;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import ca.thederpygolems.armorequip.ArmorListener;

public class Main extends JavaPlugin{
	public static SettingsManager settings = SettingsManager.getInstance();
	static CrazyEnchantments CE = CrazyEnchantments.getInstance();
	public static Economy econ = null;
	public static EconomyResponse r;
	@Override
	public void onEnable(){
		saveDefaultConfig();
		settings.setup(this);
		Bukkit.getServer().getPluginManager().registerEvents(new Valor(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new SmokeBomb(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Drunk(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Voodoo(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Confusion(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Disarmer(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Execute(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Headless(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Inquisitive(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Insomnia(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Nutrition(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Obliterate(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Paralyze(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Rage(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new SkillSwipe(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Snare(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Trap(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Wither(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Decapitation(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new IceFreeze(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Lightning(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Oxygenate(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Haste(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Telepathy(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Experience(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new AutoSmelt(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new SignControl(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new CustomEnchantments(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ECControl(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new GUI(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ArmorListener(null), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ScrollControl(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new OverLoad(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Glowing(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BurnShield(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Piercing(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Springs(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Gears(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Hulk(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new SelfDestruct(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Mermaid(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Ninja(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Vampire(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new LifeSteal(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Boom(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Venom(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new DoubleDamage(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new SlowMo(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Blindness(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Viper(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new AntiGravity(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new FastTurn(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new LightWeight(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Blessed(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new FeedMe(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Dizzy(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Berserk(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Cursed(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Rekt(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Enlightened(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Freeze(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Fortify(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Molten(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PainGiver(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Savior(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Nursery(), this);
		if (!setupEconomy()){
	   		saveDefaultConfig();
	    }
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){
		if(commandLable.equalsIgnoreCase("CE")||commandLable.equalsIgnoreCase("CrazyEnchantments")){
			if(args.length == 0){
				if(sender instanceof Player)if(!Api.permCheck((Player)sender, "Access"))return true;
				GUI.openGUI((Player)sender);
				return true;
			}
			if(args.length>=1){
				if(args[0].equalsIgnoreCase("Help")){
					if(sender instanceof Player)if(!Api.permCheck((Player)sender, "Access"))return true;
					sender.sendMessage(Api.color("&2&l&nCrazy Enchantments"));
					sender.sendMessage(Api.color("&b/CE - &9Opens the GUI."));
					sender.sendMessage(Api.color("&b/CE Help - &9Shows all CE Commands."));
					sender.sendMessage(Api.color("&b/CE Info [Enchantment] - &9Shows info on all Enchantmnets."));
					sender.sendMessage(Api.color("&b/CE Reload - &9Reloads the Config.yml."));
					sender.sendMessage(Api.color("&b/CE Add <Enchantment> <LvL> - &9Adds and enchantment to the item in your hand."));
					sender.sendMessage(Api.color("&b/CE Scroll <Player> <Scroll> <Amount> - &9Gives a player scrolls."));
					sender.sendMessage(Api.color("&b/CE Book <Enchantment> <Lvl> <Amount> <Player> - &9Gives a player a Enchantment Book."));
					return true;
				}
				if(args[0].equalsIgnoreCase("Reload")){
					if(sender instanceof Player)if(!Api.permCheck((Player)sender, "Reload"))return true;
					settings.reloadConfig();
					settings.reloadEnchs();
					settings.reloadMsg();
					settings.reloadCustomEnchs();
					settings.reloadSigns();
					sender.sendMessage(Api.getPrefix()+Api.color(settings.getMsg().getString("Messages.Config-Reload")));
					return true;
				}
				if(args[0].equalsIgnoreCase("Info")){
					if(args.length==1){
						if(!(sender instanceof Player)){
							sender.sendMessage(Api.color("&cYou need to be a Player to use this command."));
							return true;
						}
						Player player = (Player)sender;
						if(!Api.permCheck(player, "Info"))return true;
						GUI.openInfo(player);
						return true;
					}else{
						String ench = args[1];
						for(String en : Main.settings.getEnchs().getConfigurationSection("Enchantments").getKeys(false)){
							if(en.equalsIgnoreCase(ench)||Api.getEnchName(en).equalsIgnoreCase(ench)){
								String name = Main.settings.getEnchs().getString("Enchantments."+en+".Info.Name");
								List<String> desc = Main.settings.getEnchs().getStringList("Enchantments."+en+".Info.Description");
								sender.sendMessage(Api.color(name));
								for(String msg : desc)sender.sendMessage(Api.color(msg));
								return true;
							}
						}
						sender.sendMessage(Api.getPrefix()+Api.color(settings.getMsg().getString("Messages.Not-An-Enchantment")));
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("Scroll")){// /CE Scroll <Player> <Scroll> <Amount>
					if(args.length!=4){
						sender.sendMessage(Api.color("&c/CE Scroll <Player> <Scroll> <Amount>"));
						return true;
					}
					if(sender instanceof Player)if(!Api.permCheck((Player)sender, "Scroll"))return true;
					String name = args[1];
					if(!Api.isInt(args[3])){
						sender.sendMessage(Api.color("&c/CE Scroll <Player> <Scroll> <Amount>"));
						return true;
					}
					int i = Integer.parseInt(args[3]);
					if(!Api.isOnline(name, sender))return true;
					if(args[2].equalsIgnoreCase("Black")||args[2].equalsIgnoreCase("BlackScroll")){
						Api.getPlayer(name).getInventory().addItem(Api.BlackScroll(i));
						return true;
					}
					if(args[2].equalsIgnoreCase("White")||args[2].equalsIgnoreCase("WhiteScroll")){
						Api.getPlayer(name).getInventory().addItem(Api.addWhiteScroll(i));
						return true;
					}
					sender.sendMessage(Api.color("&c/CE Scroll <Player> <Scroll> <Amount>"));
					return true;
				}
				if(args[0].equalsIgnoreCase("Add")){
					if(args.length!=3){
						sender.sendMessage(Api.color("&c/CE Add <Enchantment> <LvL>"));
						return true;
					}
					Player player = (Player) sender;
					if(!Api.permCheck((Player)sender, "Admin"))return true;
					boolean T = false;
					String en = "";
					String color = "&7";
					for(String i : ECControl.allEnchantments().keySet()){
						if(Api.getEnchName(i).equalsIgnoreCase(args[1])){
							T = true;
							if(Main.settings.getEnchs().contains("Enchantments."+en)){
								color = Main.settings.getEnchs().getString("Enchantments."+en+".Color");
							}else{
								color = Main.settings.getCustomEnchs().getString("Enchantments."+en+".Color");
							}
							en = Api.getEnchName(i);
						}
					}
					if(!T){
						sender.sendMessage(Api.getPrefix()+Api.color(settings.getMsg().getString("Messages.Not-An-Enchantment")));
						return true;
					}
					String lvl = args[2];
					if(lvl.equals("1"))lvl="I";
					if(lvl.equals("2"))lvl="II";
					if(lvl.equals("3"))lvl="III";
					if(lvl.equals("4"))lvl="IV";
					if(lvl.equals("5"))lvl="V";
					if(lvl.equals("6"))lvl="VI";
					if(lvl.equals("7"))lvl="VII";
					if(lvl.equals("8"))lvl="VIII";
					if(lvl.equals("9"))lvl="IX";
					if(lvl.equals("10"))lvl="X";
					if(Api.getItemInHand(player).getType() == Material.AIR){
						player.sendMessage(Api.getPrefix()+Api.color(Api.getPrefix()+"&cYou must have an item in your hand."));return true;
					}
					Api.setItemInHand(player, Api.addGlow(Api.addLore(Api.getItemInHand(player), Api.color(color+en+" "+lvl))));
					return true;
				}
				if(args[0].equalsIgnoreCase("Book")){// /CE Book <Enchantment> <Lvl> <Amount> <Player>
					if(args.length!=5){
						sender.sendMessage(Api.color("&c/CE Book <Enchantment> <Lvl> <Amount> <Player>"));
						return true;
					}
					if(!Api.permCheck((Player)sender, "Admin"))return true;
					String ench = args[1];
					if(!Api.isInt(args[2])||!Api.isInt(args[3])){
						sender.sendMessage(Api.color("&c/CE Book <Enchantment> <Lvl> <Amount> <Player>"));
						return true;
					}
					int lvl = Integer.parseInt(args[2]);
					int amount = Integer.parseInt(args[3]);
					if(!Api.isOnline(args[4], sender))return true;
					Player player = Api.getPlayer(args[4]);
					boolean toggle = false;
					for(String en : ECControl.allEnchantments().keySet()){
						if(ench.equalsIgnoreCase(Api.getEnchName(en))){
							ench=en;
							toggle=true;
						}
					}
					if(!toggle){
						sender.sendMessage(Api.color(Api.getPrefix()+"&cThe enchantmnet &6"+ench+" &cis not an enchantment."));
						return true;
					}
					sender.sendMessage(Api.color(Api.getPrefix()+"&7You have sent &6"+player.getName()+" &7an Crazy Enchantment Book."));
					player.getInventory().addItem(Api.addGlow(ScrollControl.makeEnchantBook(ench, Api.getPower(lvl), amount)));
					return true;
				}
			}
			sender.sendMessage(Api.getPrefix()+Api.color("&cDo /CE Help for more info."));
		}
		return false;
	}
	private boolean setupEconomy(){
        if (getServer().getPluginManager().getPlugin("Vault") == null){
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null){
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
}